import sqlite3

# Connect to the SQLite database
conn = sqlite3.connect('database.db')
cursor = conn.cursor()

# Execute a SELECT query
cursor.execute("SELECT * FROM table_name")
rows = cursor.fetchall()

# Process the retrieved rows
for row in rows:
    # Access the columns by index or name
    column1_value = row[0]
    column2_value = row[1]
    # ... process the values

# Close the database connection
conn.close()
