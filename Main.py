class Animal:
    def __init__(self, nome, tem_pelo, carnivoro, is_grande, vive_em_floresta, tem_pelagem_manchada, capaz_de_nadar,
                 e_territorial, e_noturno, e_solitario, tem_garras_afiadas, e_rapido, tem_habitos_migratorios,
                 habitate_quente, sobe_arvores, extincao):
        self.nome = nome
        self.tem_pelo = tem_pelo
        self.carnivoro = carnivoro
        self.capaz_de_nadar = capaz_de_nadar
        self.is_grande = is_grande
        self.vive_em_floresta = vive_em_floresta
        self.tem_pelagem_manchada = tem_pelagem_manchada
        self.e_territorial = e_territorial
        self.e_noturno = e_noturno
        self.e_solitario = e_solitario
        self.tem_garras_afiadas = tem_garras_afiadas
        self.e_rapido = e_rapido
        self.tem_habitos_migratorios = tem_habitos_migratorios
        self.habitate_quente = habitate_quente
        self.sobe_arvores = sobe_arvores
        self.extincao = extincao


def inicializar_animais():
    animais = [
        Animal("Leopardo", True, True, True, False, True, False, False, True, True, True, True, False, True, True,
               False),
        Animal("Jaguar", True, True, True, False, True, True, True, False, False, True, False, False, True, True,
               False),
        Animal("Guepardo", True, True, True, False, False, False, False, False, False, True, False, False, True, True,
               False),
        Animal("Puma", True, True, True, False, False, False, False, False, False, True, False, False, True, True,
               True),
        Animal("Gato-do-mato", True, True, False, True, False, False, False, True, True, True, False, False, True, True,
               False),
        Animal("Lince", True, True, False, True, False, False, False, False, False, True, False, False, False, True,
               False),
        Animal("Tigre", True, True, True, False, True, True, False, False, True, True, False, False, True, True, True),
        Animal("Leão", True, True, True, False, False, False, True, False, False, True, False, False, True, True,
               False),
        Animal("Lobo", True, True, True, True, False, False, False, True, False, True, False, False, False, False,
               False),
        Animal("Hiena", True, True, True, True, True, False, False, False, False, False, False, False, True, False,
               False),
        ]
    return animais


def main():
    animais = inicializar_animais()

    contador_perguntas = 0

    while contador_perguntas < 15:
        contador_perguntas += 1
        print("Pergunta", contador_perguntas)

        # Perguntas específicas
        if contador_perguntas == 1:
            print("O animal tem pelo? (1 - sim / 2 - não)")
        elif contador_perguntas == 2:
            print("O animal é carnívoro? (1 - sim / 2 - não)")
        elif contador_perguntas == 3:
            print("O animal é grande? (1 - sim / 2 - não)")
        elif contador_perguntas == 4:
            print("O animal vive em florestas? (1 - sim / 2 - não)")
        elif contador_perguntas == 5:
            print("O animal tem uma pelagem manchada? (1 - sim / 2 - não)")
        elif contador_perguntas == 6:
            print("O animal é capaz de nadar? (1 - sim / 2 - não)")
        elif contador_perguntas == 7:
            print("O animal é territorial? (1 - sim / 2 - não)")
        elif contador_perguntas == 8:
            print("O animal é noturno? (1 - sim / 2 - não)")
        elif contador_perguntas == 9:
            print("O animal é solitário? (1 - sim / 2 - não)")
        elif contador_perguntas == 10:
            print("O animal tem garras afiadas? (1 - sim / 2 - não)")
        elif contador_perguntas == 11:
            print("O animal é rápido?(1 - sim / 2 - não)")
        elif contador_perguntas == 12:
            print("O animal tem hábitos migratórios? (1 - sim / 2 - não)")
        elif contador_perguntas == 13:
            print("O animal vive em um ambiente quente? (1 - sim / 2 - não)")
        elif contador_perguntas == 14:
            print("O animal sobe em árvores? (1 - sim / 2 - não)")
        elif contador_perguntas == 15:
            print("O animal está em extinção? (1 - sim / 2 - não)")

        resposta = int(input("Resposta: "))
        while resposta not in [1, 2]:
            print("Resposta inválida. Digite 1 para sim ou 2 para não:")
            resposta = int(input("Resposta: "))

        animais_restantes = []
        for animal in animais:
            if contador_perguntas == 1:
                if (resposta == 1 and animal.tem_pelo) or (resposta == 2 and not animal.tem_pelo):
                    animais_restantes.append(animal)
            elif contador_perguntas == 2:
                if (resposta == 1 and animal.carnivoro) or (resposta == 2 and not animal.carnivoro):
                    animais_restantes.append(animal)
            elif contador_perguntas == 3:
                if (resposta == 1 and animal.is_grande) or (resposta == 2 and not animal.is_grande):
                    animais_restantes.append(animal)
            elif contador_perguntas == 4:
                if (resposta == 1 and animal.vive_em_floresta) or (resposta == 2 and not animal.vive_em_floresta):
                    animais_restantes.append(animal)
            elif contador_perguntas == 5:
                if (resposta == 1 and animal.tem_pelagem_manchada) or (
                        resposta == 2 and not animal.tem_pelagem_manchada):
                    animais_restantes.append(animal)
            elif contador_perguntas == 6:
                if (resposta == 1 and animal.capaz_de_nadar) or (resposta == 2 and not animal.capaz_de_nadar):
                    animais_restantes.append(animal)
            elif contador_perguntas == 7:
                if (resposta == 1 and animal.e_territorial) or (resposta == 2 and not animal.e_territorial):
                    animais_restantes.append(animal)
            elif contador_perguntas == 8:
                if (resposta == 1 and animal.e_noturno) or (resposta == 2 and not animal.e_noturno):
                    animais_restantes.append(animal)
            elif contador_perguntas == 9:
                if (resposta == 1 and animal.e_solitario) or (resposta == 2 and not animal.e_solitario):
                    animais_restantes.append(animal)
            elif contador_perguntas == 10:
                if (resposta == 1 and animal.tem_garras_afiadas) or (resposta == 2 and not animal.tem_garras_afiadas):
                    animais_restantes.append(animal)
            elif contador_perguntas == 11:
                if (resposta == 1 and animal.e_rapido) or (resposta == 2 and not animal.e_rapido):
                    animais_restantes.append(animal)
            elif contador_perguntas == 12:
                if (resposta == 1 and animal.tem_habitos_migratorios) or (
                        resposta == 2 and not animal.tem_habitos_migratorios):
                    animais_restantes.append(animal)
            elif contador_perguntas == 13:
                if (resposta == 1 and animal.habitate_quente) or (resposta == 2 and not animal.habitate_quente):
                    animais_restantes.append(animal)
            elif contador_perguntas == 14:
                if (resposta == 1 and animal.sobe_arvores) or (resposta == 2 and not animal.sobe_arvores):
                    animais_restantes.append(animal)
            elif contador_perguntas == 15:
                if (resposta == 1 and animal.extincao) or (resposta == 2 and not animal.extincao):
                    animais_restantes.append(animal)

        animais = animais_restantes

        if len(animais) == 1 and contador_perguntas >= 5:
            for animal in animais:
                print("SEU ANIMAL É: ", animal.nome)
            break
        elif contador_perguntas == 15:
            for animal in animais:
                print("SEU ANIMAL É: ", animal.nome)
            break
        elif len(animais) == 0:
            print("NAO TEM ANIMAL")
            break


if __name__ == "__main__":
    main()
