import webbrowser

tradingview_url = "https://in.tradingview.com/chart/Rw8qUoDH/?symbol=NSE%3ANIFTY"
kite_url = "https://kite.zerodha.com/"
chrome_path = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
webbrowser.register("chrome", None, webbrowser.BackgroundBrowser(chrome_path))
browser = webbrowser.get("chrome")
browser.open_new_tab(tradingview_url)
browser.open_new_tab(kite_url)