
import yfinance as yf
tickerlist = ["A", "B", "C", "D", "E", "F", "G", "H", "J", "K",]
for x in  range(0, 10):
 ticker = tickerlist[x] 
 stock = yf.Ticker(ticker)
 current_price = stock.history(period="1d")["Close"][0]
 info = stock.info

 print("Ticker: ", tickerlist[x])
 print(info["longName"])
 print(info["website"])
 print(ticker + " Current Price:", current_price)
 print("\n\n\n")
ticker = input("Now enter your own ticker!(In All Capitals) ")
stock = yf.Ticker(ticker)
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

print("Ticker: ", ticker)
print(info["longName"])
print(info["website"])
print(ticker + " Current Price:", current_price)
