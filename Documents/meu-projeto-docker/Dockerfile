# Usando uma imagem oficial do Python como base
FROM python:3.11-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo de dependências (se você tiver um)
# Se não tiver, pode pular a linha do pip install por enquanto
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copia o restante dos arquivos do seu projeto para o container
COPY . .

# Comando para executar a sua aplicação de financiamento
CMD ["python", "main.py"]
