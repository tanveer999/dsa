def my_fun(**kwargs):
    for key,value in kwargs.items():
        print(f'{key} - {value}')
    
my_fun(first=1, second=2)
