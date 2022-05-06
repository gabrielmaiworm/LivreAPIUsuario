import dayjs from 'dayjs';
import { IEndereco } from 'app/shared/model/endereco.model';
import { Lesao } from 'app/shared/model/enumerations/lesao.model';
import { Situacao } from 'app/shared/model/enumerations/situacao.model';

export interface IUsuario {
  id?: number;
  nome?: string | null;
  email?: string | null;
  nascimento?: string | null;
  documento?: string | null;
  lesao?: Lesao | null;
  situacao?: Situacao | null;
  usoProprio?: boolean | null;
  nomeDependente?: string | null;
  nascimentoDependente?: string | null;
  facebook?: string | null;
  instagram?: string | null;
  termo?: boolean | null;
  treinamento?: boolean | null;
  fotoDocContentType?: string | null;
  fotoDoc?: string | null;
  fotoComDocContentType?: string | null;
  fotoComDoc?: string | null;
  endereco?: IEndereco | null;
}

export const defaultValue: Readonly<IUsuario> = {
  usoProprio: false,
  termo: false,
  treinamento: false,
};
