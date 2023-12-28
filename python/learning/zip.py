import zipfile
import os

zip_dir = '/home/tanveer/to-delete'
new_zip = zipfile.ZipFile('new.zip', 'w')
# new_zip.write(zip_dir)
# new_zip.close()

# read_zip = zipfile.ZipFile('new.zip')
# print(read_zip.namelist())
# read_zip.close()

for root, subfolders, files in os.walk(zip_dir):
    new_zip.write(root)

    for file in files:
        new_zip.write(os.path.join(root,file))

print(new_zip.namelist())