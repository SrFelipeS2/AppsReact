import React from 'react';
import CountUp from 'react-countup';
import { useInView } from 'react-intersection-observer'
import { motion } from 'framer-motion'
import { fadeIn } from '../variants'


const About = () => {
  const [ref, inView] = useInView({
    threshold: 0.5,
  })
  return (
    <section className='section' id='about' ref={ref}>
      <div className='container mx-auto'>
        <div className='flex flex-col gap-y-8 lg:flex-row lg:items-center lg:gap-x-20 lg:gap-y-0 h-screen'>
          <motion.div
            variants={fadeIn('right', 0.3)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.3 }}
            className='flex-1 bg-about bg-contain bg-no-repeat h-[640px] mix-blend-lighten bg-top '></motion.div>
          < motion.div 
           variants={fadeIn('left', 0.5)}
           initial="hidden"
           whileInView={'show'}
           viewport={{once:false, amount:0.3}}
          className='flex-1'>
            <h2 className='h2 text-accent'>About me.</h2>
            <h3 className='h3 mb-4'>
              I'm a Software developer with 1 year of experience.
            </h3>
            <p className='mb-6'>
              I'm Andres Felipe Valencia, a 24-year-old individual with a degree in Technology for Analysis and Development of Computer Systems, and I am passionate about technology. My knowledge and experience in this field drive me as a semi-senior Developer, with skills in computer assembly, HTML, CSS, JavaScript, React, object-oriented programming, paradigms of programming and SQL Server, focusing on web application development. I am currently seeking new job opportunities that will allow me to grow personally and professionally, while contributing my skills to the success of my team and company. I am highly committed to self-learning, taking responsibility, and having a strong desire and enthusiasm to be part of an organization.
            </p>
            <div className='flex gap-x-6 lg:gap-x-10 mb-12'>
              <div>
                <div className='text-[40px] font-tertiary text-gradient mb-2'>
                  {
                    inView ?
                      <CountUp start={0} end={1} duration={10} /> : null}
                </div>
                <div className='font-primary text-sm tracking-[2px]'> Years of Experience <br /></div>
              </div>
              <div>
                <div className='text-[40px] font-tertiary text-gradient mb-2'>
                  {
                    inView ?
                      <CountUp start={0} end={1} duration={10} /> : null}
                </div>
                <div className='font-primary text-sm tracking-[2px]'> Years of Experience <br /></div>
              </div>
              <div>
                <div className='text-[40px] font-tertiary text-gradient mb-2'>
                  {
                    inView ?
                      <CountUp start={0} end={1} duration={10} /> : null}
                </div>
                <div className='font-primary text-sm tracking-[2px]'> Years of Experience <br /></div>
              </div>
            </div>
          </motion.div>
        </div>
      </div>
    </section>
  );
};

export default About;
