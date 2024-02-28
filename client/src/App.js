import './App.css';
import React, { useState } from 'react';

function App() {
  const scoringSystem = {
    "Happy": 10,
    "Neutral": 5,
    "Sad": 2,
    "Just myself": 5,
    "With a group of friends and family": 7,
    "Action": 8,
    "Adventure": 8,
    "Comedy": 10,
    "Romance": 4,
    "Science Fiction": 2
  }


  const questions = [
    {
      questionText: 'How are you feeling today?',
      answerOptions: [
        { answerText: 'Happy' },
        { answerText: 'Sad' },
        { answerText: 'Neutral' },
      ],
    },
    {
      questionText: 'Pick the occasion?',
      answerOptions: [
        { answerText: 'Just myself' },
        { answerText: 'With a group of friends and family' },
      ],
    },
    {
      questionText: 'What genre do you prefer the most?',
      answerOptions: [
        { answerText: 'Action' },
        { answerText: 'Adventure' },
        { answerText: 'Comedy' },
        { answerText: 'Romance' },
        { answerText: 'Science Fiction' }
      ],
    }
  ];
  const questionsSize = questions.length;
  const [currentQuestionIdx, setCurrentQuestionIdx] = useState(0);
  const [userAnswers, setUserAnswers] = useState([]);

  const handleAnswerButtonClick = (answerText) => {
    setUserAnswers(prevAnswers => [...prevAnswers, answerText]);
    const nextQuestionIdx = currentQuestionIdx + 1;
    if (nextQuestionIdx <= questionsSize) {
      setCurrentQuestionIdx(nextQuestionIdx);
    } else {
      // Nothing yet

    }
  }

  const restartQuiz = () => {
    setCurrentQuestionIdx(0)
    setUserAnswers([]);
  }


  return (
    <div className='app'>
      {currentQuestionIdx >= questionsSize ? (
        <div className='score-section'>
          <div>End of the Questionaire</div>
          <div className='user-answers'>
            <h3>Your Answers:</h3>
            <ul>
              {userAnswers.map((answer, index) => (
                <li key={index}>{answer}</li>
              ))}
            </ul>
          </div>
          <button onClick={restartQuiz}>Restart</button>
        </div>
      ) : (
        <>
          <div className='question-section'>
            <div className='question-count'>
              <span>Question {currentQuestionIdx + 1}</span>/{questionsSize}
            </div>
            <div className='question-text'>{questions[currentQuestionIdx].questionText}</div>
          </div>
          <div className='answer-section'>
            {questions[currentQuestionIdx].answerOptions.map((answerOption, index) => (
              <button
                className="button"
                onClick={() => handleAnswerButtonClick(answerOption.answerText)} key={index}>
                {answerOption.answerText}
              </button>
            ))}
          </div>
        </>
      )}
    </div>
  );
}

export default App;
