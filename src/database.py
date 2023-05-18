import sqlite3

# Connect to the database
conn = sqlite3.connect('mydatabase.db')
c = conn.cursor()

try:
    # Execute your SQL queries or other database operations here




    # Example: Creating a table
    c.execute('''CREATE TABLE IF NOT EXISTS employees
                 (id INT PRIMARY KEY     NOT NULL,
                 name           TEXT    NOT NULL,
                 age            INT     NOT NULL,
                 address        CHAR(50),
                 salary         REAL);''')
                 
    # Commit the changes
    conn.commit()

    # Close the connection
    conn.close()
except Exception as e:
    print("Error:", str(e))
