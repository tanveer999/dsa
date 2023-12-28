data = [
    {
        'name': 'luffy',
        'age': 18,
        'gender': 'male'
    },
    {
        'name': 'law',
        'gender': 'male'
    },
    {
        'name': 'nami',
        'gender': 'male'
    },
    {
        'name': 'robin',
        'age': 25
    }
]

age_data = []
gender_data = []
for item in data:
    try:
        age_data.append(item['age'])
    except KeyError:
        age_data.append('')
    
    try:
        gender_data.append(item['gender'])
    except KeyError:
        gender_data.append('')
    
print(age_data)
print(gender_data)