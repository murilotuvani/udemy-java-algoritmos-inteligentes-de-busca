/**
 *  @see https://mit-license.org/
 *  The MIT License (MIT)
 * Copyright © 2019 <copyright holders>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: The above copyright
 * notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package estruturas;

import grafocidades.Cidade;

/**
 * 29/10/2019 23:13:47
 *
 * @author murilotuvani
 */
public class VetorOrdenado {

    private Cidade[] cidades;
    private int numeroElementos = 0;

    public VetorOrdenado(int size) {
        this.cidades = new Cidade[size];
        numeroElementos = 0;
    }

    public void inserir(Cidade cidade) {
        int posicao;
        for (posicao = 0; posicao < numeroElementos; posicao++) {
            if (cidades[posicao].getDistanciaObjetivo() > cidade.getDistanciaObjetivo()) {
                break;
            }
        }

        for (int k = numeroElementos; k > posicao; k--) {
            cidades[k] = cidades[k - 1];

        }
    }

    public void mostrar() {
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(cidades[i].getNome() + "- " + cidades[i].getDistanciaObjetivo());
        }
    }

    public Cidade getPrimeiro() {
        return cidades[0];
    }

}
