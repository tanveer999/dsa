#!/usr/bin/python3

from distutils.core import setup
from Cython.Build import cythonize

setup(ext_modules = cythonize('test.py', compiler_directives={'language_level': "3"}))