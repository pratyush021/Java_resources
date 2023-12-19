import requests as req
import sys

url = "http://localhost:8080"


args = sys.argv[1:]


def get(url, method): 
    if method.lower() == "get": 
        res = req.get(url)
        if res.status_code == 200:
            print(res.text)
        else: 
            print(f"Error: {res.status_code}")
        print("====================")
    if method.lower() == "post":
        print("Sorry, we do not support post calls as of now!") 





for arg in args: 
    url, method = arg.split("_")
    print(f"HTTP CALL: {url}")
    get(url, method)
