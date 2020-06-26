
n = input()
input_line = input()
input_list = input_line.split()
input_list = [ int(x) for x in input_list ]
t = tuple(input_list)
print(hash(t))
