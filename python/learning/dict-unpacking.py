from icecream import ic

def course(id, name, duration):
    print(id)
    print(name)
    print(duration)

def new_course(data):
    print('New course')
    print(data)

def new_course_1(**data):
    print('New course 1')
    print(data)

course1 = {
    'id': 1,
    'name': 'Science',
    'duration': '10 hr'
}

course(**course1)
new_course(course1)
new_course_1(**course1)