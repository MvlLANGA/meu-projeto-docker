def calcular_financiamento(valor_total, taxa_juros_anual, parcelas):
    taxa_mensal = (taxa_juros_anual / 100) / 12
    # Fórmula de amortização (Price)
    parcela_valor = valor_total * (taxa_mensal * (1 + taxa_mensal)**parcelas) / ((1 + taxa_mensal)**parcelas - 1)
    return parcela_valor

if __name__ == "__main__":
    print("--- Simulador de Financiamento ---")
    valor = 50000
    juros = 12  # 12% ao ano
    tempo = 48  # 48 meses
    
    resultado = calcular_financiamento(valor, juros, tempo)
    
    print(f"Valor do Bem: R$ {valor}")
    print(f"Taxa: {juros}% ao ano")
    print(f"Parcelas: {tempo} meses")
    print(f"Valor da Parcela Mensal: R$ {resultado:.2f}")
    print("----------------------------------")
