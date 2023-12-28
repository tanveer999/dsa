import pandas as pd
import xlsxwriter

data = [{"key1": "value1", "key2": {"key3": "value3", "key4": 5}},
        {"key1": "value2", "key2": {"key5": "value5", "key4": 10}}]

# Convert to list of lists
data_list = []
for item in data:
    row = []
    for key, value in item.items():
        if isinstance(value, dict):
            for k, v in value.items():
                row.append(v)
        else:
            row.append(value)
    data_list.append(row)

# Create workbook and worksheet
workbook = xlsxwriter.Workbook("output.xlsx")
worksheet = workbook.add_worksheet()

# Write headers
for col_idx, col_name in enumerate(data_list[0]):
    worksheet.write(0, col_idx, col_name)

# Write data
for row_idx, row in enumerate(data_list[1:]):
    for col_idx, value in enumerate(row):
        worksheet.write(row_idx + 1, col_idx, value)

# Close workbook
workbook.close()
