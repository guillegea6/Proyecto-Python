import urllib.request
import requests

#SACAR IP PUBLICA#

mi_ip = urllib.request.urlopen('https://ident.me').read().decode('utf8')

#PRIMERO ASIGNAMOS EL VALOR DEL ARCHIVO EN UNA VARIABLE 
ip_log = open('log_ip.txt', 'r')

#ESCRIBIMOS EN EL ARCHIVO DE TEXTO LA IP 
with open('log_ip.txt', 'w' ) as f:
   f.write(mi_ip)

if(mi_ip!= ip_log):
   headers = {
        "X-API-Key": "6316c352a060419eb73d9adca705bb6c.cKpvPsn1Ep7Tsa_sLPuBIypak1lDLLxAolwtreEEArIgC-sjLKrsW867lxjILqDJM9pa0-v1XTck8AHy-akRqg"
   } 
   data = {
      "disabled": False,
      "content": mi_ip,
      "ttl": 3600,
      "prio": 0
   }
   requests.put("https://api.hosting.ionos.com/dns/v1/zones/04fcaaca-5ec1-11ed-8646-0a5864440975/records/6e74311d-efd6-6152-b732-968c59d55036", headers=headers, json=data)
