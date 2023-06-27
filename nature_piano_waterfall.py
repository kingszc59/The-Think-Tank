# File Name: Think_Tank_Code_1.py

# Importing necessary libraries
import math
import numpy as np
import pandas as pd

# Helper function to convert celsius to Fahrenheit
def ctof(celsius):
  return celsius * 9/5 + 32

# Helper function to convert Fahrenheit to celsius
def ftoc(fahrenheit):
  return (fahrenheit - 32) * 5/9

# Function to calculate area of a circle
def circle_area(radius):
  return math.pi * (radius ** 2)

# Function to calculate area of a triangle
def triangle_area(base, height):
  return 0.5 * base * height

# Function to calculate area of a rectangle
def rectangle_area(length, width):
  return length * width

# Function to calculate area of a trapezoid
def trapezoid_area(base1, base2, height):
  return 0.5 * (base1 + base2) * height

# Function to calculate area of a parallelogram
def parallelogram_area(base, height):
  return base * height

# Function to calculate the volume of a sphere
def sphere_vol(radius):
  return (4/3) * math.pi * (radius ** 3)

# Function to calculate the volume of a cube
def cube_vol(side):
  return side ** 3

# Function to calculate the volume of a cylinder 
def cylinder_vol(radius, height):
  return math.pi * (radius ** 2) * height

# Function to calculate the volume of a rectangular prism
def rectangular_prism_vol(length, width, height):
  return length * width * height

# Function to calculate the volume of a pyramid
def pyramid_vol(length, width, height):
  return (length * width * height) / 3

# Function to calculate the surface area of a sphere
def sphere_surf_area(radius):
  return 4 * math.pi * (radius ** 2)

# Function to calculate the surface area of a cube
def cube_surf_area(side):
  return 6 * (side ** 2)

# Function to calculate the surface area of a cylinder
def cylinder_surf_area(radius, height):
  return (2 * math.pi * radius * height) + (2 * math.pi * (radius ** 2))

# Function to calculate the surface area of a rectangular prism
def rectangular_prism_surf_area(length, width, height):
  return 2 * (length * width + length * height + width * height)

# Function to calculate the surface area of a pyramid
def pyramid_surf_area(length, width, height):
  return (length * width) + (length * (math.sqrt(height ** 2 + (0.5 * width) ** 2)) + (width * (math.sqrt(height ** 2 + (0.5 * length) ** 2))))

# Function to calculate BMI
def BMI_calc(weight, height):
  return weight / (height ** 2)

# Function to calculate roots of a quadratic equation
def quadratic_roots(a, b, c):
  disc = math.sqrt(b**2 - (4 * a * c))
  root1 = (-b + disc) / (2 * a)
  root2 = (-b - disc) / (2 * a)
  return root1, root2

# Function to generate a random number between two given numbers
def random_number_generator(low, high):
  return np.random.randint(low, high + 1)

# Function to generate a list of random numbers between two given numbers
def random_number_list_generator(low, high, size):
  return np.random.randint(low, high + 1, size)

# Function to check whether a given year is a leap year or not
def leap_year_checker(year):
  if year % 400 == 0 or (year % 100 != 0 and year % 4 == 0):
    return True
  else:
    return False

# Function to calculate the simple interest
def simple_interest(principal, rate, time):
  return (principal * rate * time) / 100

# Function to calculate the compound interest
def compound_interest(principal, rate, time):
  return principal * (math.pow((1 + rate / 100), time))

# Function to calculate factorial
def factorial_calc(number):
  fact = 1
  for x in range(1, number + 1):
    fact = fact * x
  return fact

# Function to calculate the mean, median and mode of a list
def mm_calc(data):
  mean = np.mean(data)
  median = np.median(data)
  data = pd.Series(data)
  mode = data.mode()
  return mean, median, mode

# Function to calculate the variance
def variance_calc(data):
  mean = np.mean(data)
  total = 0 
  for x in data: 
    total += (x - mean) ** 2
  return total / len(data)

# Function to calculate the standard deviation
def std_dev_calc(data):
  return math.sqrt(variance_calc(data))

# Function to calculate the mode of a discrete probability distribution
def mode_calc(data):
  max = 0
  mode = 0
  for x in data:
    if data.count(x) > max:
      max = data.count(x)
      mode = x
  return mode