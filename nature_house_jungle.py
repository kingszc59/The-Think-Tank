# The Think Tank

# Importing libraries
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# Setting up global variables
data_source = "Data_ThinkTank.csv"

# Defining functions
def read_file(filename):
    """Reads in the data from a csv and returns a pandas dataframe.

    Parameters:
    filename (str): The name of the csv file.

    Returns:
    df (DataFrame): A pandas dataframe with the data from the csv.
    """
    df = pd.read_csv(filename, index_col=0)
    return df

def visualize(df):
    """Takes in a pandas dataframe and visualizes it.

    Parameters:
    df (DataFrame): A pandas dataframe with data to be visualized.
    """
    # Creating the plot object
    fig = plt.figure()
    ax = fig.add_subplot(1, 1, 1)
    #Plotting the data
    df.plot(kind='line', ax=ax)
    plt.title('Data Visualization')
    plt.xlabel('Time')
    plt.ylabel('Number of people')
    plt.show()

def create_new_column(df):
    """Takes in a pandas dataframe and creates a new column.

    Parameters:
    df (DataFrame): A pandas dataframe with data.

    Returns:
    df (DataFrame): A pandas dataframe with the added column.
    """
    # Creating a new column
    df['Difference'] = df['People in'] - df['People out']
    return df

def find_max_value(df):
    """Takes in a pandas dataframe and finds the maximum value in a column.

    Parameters:
    df (DataFrame): A pandas dataframe with data.

    Returns:
    max_value (int): The maximum value in the column.
    """
    # Finding the maximum value in the column
    max_value = np.max(df['Difference'])
    return max_value

def find_time_of_max_value(df, max_value):
    """Takes in a pandas dataframe and finds the time of the maximum value.

    Parameters:
    df (DataFrame): A pandas dataframe with data.
    max_value (int): The maximum value in the column.

    Returns:
    max_time (str): The time of the maximum value.
    """
    # Finding the time of the maximum value
    max_time = df[df['Difference'] == max_value].index[0]
    return max_time

# Main
# Reading in the data
df = read_file(data_source)
# Visualizing the data
visualize(df)
# Creating a new column
df = create_new_column(df)
# Finding the maximum value in the column
max_value = find_max_value(df)
# Finding the time of the maximum value
max_time = find_time_of_max_value(df, max_value)
# Printing the results
print('The maximum number of people in the think tank was {} at {}'.format(max_value, max_time))