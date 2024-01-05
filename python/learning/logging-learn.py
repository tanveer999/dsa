import logging
import sys

# Create a logger
logger = logging.getLogger('logger')
logger.setLevel(logging.DEBUG)

# Create a StreamHandler with the default stream (sys.stdout)
stream_handler = logging.StreamHandler(stream=sys.stdout)
stream_handler.setLevel(logging.DEBUG)

# Create a formatter and attach it to the handler
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
stream_handler.setFormatter(formatter)

# Add the handler to the logger
logger.addHandler(stream_handler)

# Log some messages
logger.debug('This is a debug message')
logger.info('This is an info message')
logger.warning('This is a warning message')
logger.error('This is an error message')
logger.critical('This is a critical message')

# Print some messages
print('This is a print statement')