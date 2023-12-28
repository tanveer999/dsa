import argparse

parser = argparse.ArgumentParser(description='Manage groups and users.')
subparsers = parser.add_subparsers(dest='command')

# Create the parser for the "group" command
parser_group = subparsers.add_parser('group', help='Manage groups.')
group_subparsers = parser_group.add_subparsers(dest='subcommand')

# Create the parser for the "group list" command
parser_group_list = group_subparsers.add_parser('list', help='List groups.')

# Create the parser for the "group remove" command
parser_group_remove = group_subparsers.add_parser('remove', help='Remove a group.')
parser_group_remove.add_argument('group', help='Group to remove.')

# Create the parser for the "user" command
parser_user = subparsers.add_parser('user', help='Manage users.')
user_subparsers = parser_user.add_subparsers(dest='subcommand')

# Create the parser for the "user add" command
parser_user_add = user_subparsers.add_parser('add', help='Add a user.')
parser_user_add.add_argument('username', help='Username of the user to add.')

# Create the parser for the "user remove" command
parser_user_remove = user_subparsers.add_parser('remove', help='Remove a user.')
parser_user_remove.add_argument('username', help='Username of the user to remove.')

# Create the parser for the "user list" command
parser_user_list = user_subparsers.add_parser('list', help='List users.')

args = parser.parse_args()

print(args)