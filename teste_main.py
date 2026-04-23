import unittest
from main import calcular_financiamento

class TestFinanciamento(unittest.TestCase):

    def test_calculo_basico(self):
        resultado = calcular_financiamento(50000, 12, 48)
        self.assertTrue(resultado > 0)

    def test_valor_pequeno(self):
        resultado = calcular_financiamento(1000, 10, 12)
        self.assertTrue(resultado > 0)

    def test_juros_zero(self):
        resultado = calcular_financiamento(1200, 0, 12)
        self.assertAlmostEqual(resultado, 100)

    def test_muitas_parcelas(self):
        resultado = calcular_financiamento(10000, 10, 120)
        self.assertTrue(resultado > 0)

    def test_tipo_retorno(self):
        resultado = calcular_financiamento(50000, 12, 48)
        self.assertIsInstance(resultado, float)

if __name__ == '__main__':
    unittest.main()