import { QuizConfig } from './quiz-config';
import { Question } from './question';

export class Quiz {
    id: number | undefined;
    name: string | undefined;
    description: string | undefined;
    config: QuizConfig | undefined;
    questions!: Question[];

    constructor(data: any) {
        if (data) {
            this.id = data.id;
            this.name = data.name;
            this.description = data.description;
            this.config = new QuizConfig(data.config);
            this.questions = [];
            data.questions.forEach(q => {
                this.questions.push(new Question(q));
            });
        }
    }
}