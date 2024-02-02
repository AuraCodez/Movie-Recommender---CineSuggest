import './App.css';
import React, { useState } from 'react';

function App() {
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
  const [suggestions, setSuggestions] = useState([]);

  const handleAnswerButtonClick = (answerText) => {
    setUserAnswers(prevAnswers => [...prevAnswers, answerText]);
    const nextQuestion = currentQuestionIdx + 1;
    if (nextQuestion < questionsSize) {
      setCurrentQuestionIdx(nextQuestion);
    } else {
      // Generate the suggestions here, and display the suggestions
    }
  }


  return (
    <div className='app'>
      {currentQuestionIdx >= questionsSize ? (
        <div className='score-section'>End of the Questionaire</div>
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
              <button onClick={() => handleAnswerButtonClick(answerOption.answerText)} key={index}>
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
