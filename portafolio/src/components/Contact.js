import { motion } from 'framer-motion';
import React from 'react';
import { fadeIn } from '../variants';

const Contact = () => {
  return (
    <section className='section md:section h-[1100px]' id='contact'>
      <div className='container mx-auto'>
        <div className='flex flex-col  lg:flex-row'>
          <motion.div
            variants={fadeIn('up', 0.3)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.3 }}>
            <div>
              <h4 className='h2 leading-tight uppercase text-accent mb-2 tracking-wide'>
                Ongoing Learning: Certifications, Language Skills, and Programming Projects
              </h4>
              <div>
                I must also highlight my enthusiasm for acquiring new knowledge. My LinkedIn profile shows numerous certificates from courses I have taken, and there are also several courses I am currently taking. For example, I am currently enrolled in a programme focused on the GO programming language integrated with React. I am also committed to improving my English language skills to ensure effective and fluent communication. I am committed to expanding my professional knowledge and refining my interpersonal skills on a daily basis.
              </div>
              <h2 className='text-[45px] lg:text-[90px] leading-none mb-12'>
                Let's work <br /> together!
              </h2>
              <a className='py-4 btn btn-lg max-w-lg text-center' href='https://wa.link/o4xur7'>Contact Me</a>
            </div>
          </motion.div>
        </div>
      </div>
    </section>
  );
};

export default Contact;
