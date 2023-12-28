import os
import zipfile

walk_dir = '/home/tanveer/to-delete'

for root, subfolders, files in os.walk(walk_dir):
    print(f'Folder is {root}')
    # for subfolder in subfolders:
    #     print(f'Subfolder in {folders}: {subfolder}')
    print(f'Subfolders in {root}: {subfolders}')
    # for file in files:
    #     print(f'Files in {folders}: {file} ')
    print(f'Files is {root}: {files}')