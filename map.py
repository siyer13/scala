def convert_string(s):
    l = {}
    for c in s:
        if c in l:
            l[c]+= 1
        else:
            l[c] = 1
    cs = ''
    for key in l:
        cs += str(key) +str(l[key])
    return cs


print convert_string('yyyxtt')
