store_details = [
    "SEMICOLON STORES",
    "MAIN BRANCH",
    "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.",
    "TEL: 03293828343"
]
for index in range(len(store_details)):
    print(store_details[index])
print("==================================================")
cashier_name  = input("Cashier Name: ")
customer_name = input("Customer Name: ")
number_of_products = int(input("How many products does the customer have?: "))
product_names = []
quantities    = []
prices        = []
item_totals   = []
for index in range(number_of_products):
    print("--- Product " + str(index + 1) + " ---")
    name  = input("Product Name: ")
    price = float(input("Price: ")
    qty   = int(input("Quantity: "))
    product_names.append(name)
    prices.append(price)
    quantities.append(qty)
    item_totals.append(price * qty)
sub_total = 0
for index in range(len(item_totals)):
    sub_total = sub_total + item_totals[index]
discount = 0
if sub_total > 5000:
    discount = sub_total * 0.08
vat        = (sub_total - discount) * 0.075
bill_total = sub_total - discount + vat
amount_paid = float(input("How much did the customer give to you?: "))
balance     = amount_paid - bill_total
print("==================================================")
for index in range(len(store_details)):
    print(store_details[index])
print("Cashier: " + cashier_name)
print("Customer Name: " + customer_name)
print("==================================================")
print("ITEM              QTY    PRICE      TOTAL(NGN)")
print("--------------------------------------------------")
for index in range(number_of_products):
    print(product_names[index] + "   " + str(quantities[index]) + "   " + str(prices[index]) + "   " + str(item_totals[index]))
print("--------------------------------------------------")
print("Sub Total:     " + str(sub_total))
print("Discount:      " + str(discount))
print("VAT @ 7.5%:    " + str(vat))
print("==================================================")
print("Bill Total:    " + str(bill_total))
print("Amount Paid:   " + str(amount_paid))
print("Balance:       " + str(balance))
print("==================================================")
print("     THANK YOU FOR YOUR PATRONAGE")
print("==================================================")
