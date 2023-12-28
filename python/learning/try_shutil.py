import shutil
import os

copy_dir = '/home/tanveer/to-delete'
shutil.copytree(copy_dir, f'{os.getcwd()}/test')