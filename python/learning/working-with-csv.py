import pandas

data = pandas.read_csv('test.csv')

names = data['number'].tolist()

print(names)
